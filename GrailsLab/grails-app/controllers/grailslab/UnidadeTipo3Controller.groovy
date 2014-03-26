package grailslab



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UnidadeTipo3Controller {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond UnidadeTipo3.list(params), model:[unidadeTipo3InstanceCount: UnidadeTipo3.count()]
    }

    def show(UnidadeTipo3 unidadeTipo3Instance) {
        respond unidadeTipo3Instance
    }

    def create() {
        respond new UnidadeTipo3(params)
    }

    @Transactional
    def save(UnidadeTipo3 unidadeTipo3Instance) {
        if (unidadeTipo3Instance == null) {
            notFound()
            return
        }

        if (unidadeTipo3Instance.hasErrors()) {
            respond unidadeTipo3Instance.errors, view:'create'
            return
        }

        unidadeTipo3Instance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'unidadeTipo3Instance.label', default: 'UnidadeTipo3'), unidadeTipo3Instance.id])
                redirect unidadeTipo3Instance
            }
            '*' { respond unidadeTipo3Instance, [status: CREATED] }
        }
    }

    def edit(UnidadeTipo3 unidadeTipo3Instance) {
        respond unidadeTipo3Instance
    }

    @Transactional
    def update(UnidadeTipo3 unidadeTipo3Instance) {
        if (unidadeTipo3Instance == null) {
            notFound()
            return
        }

        if (unidadeTipo3Instance.hasErrors()) {
            respond unidadeTipo3Instance.errors, view:'edit'
            return
        }

        unidadeTipo3Instance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'UnidadeTipo3.label', default: 'UnidadeTipo3'), unidadeTipo3Instance.id])
                redirect unidadeTipo3Instance
            }
            '*'{ respond unidadeTipo3Instance, [status: OK] }
        }
    }

    @Transactional
    def delete(UnidadeTipo3 unidadeTipo3Instance) {

        if (unidadeTipo3Instance == null) {
            notFound()
            return
        }

        unidadeTipo3Instance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'UnidadeTipo3.label', default: 'UnidadeTipo3'), unidadeTipo3Instance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'unidadeTipo3Instance.label', default: 'UnidadeTipo3'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

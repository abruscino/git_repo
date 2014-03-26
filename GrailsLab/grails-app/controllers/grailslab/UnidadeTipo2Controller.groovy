package grailslab



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UnidadeTipo2Controller {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond UnidadeTipo2.list(params), model:[unidadeTipo2InstanceCount: UnidadeTipo2.count()]
    }

    def show(UnidadeTipo2 unidadeTipo2Instance) {
        respond unidadeTipo2Instance
    }

    def create() {
        respond new UnidadeTipo2(params)
    }

    @Transactional
    def save(UnidadeTipo2 unidadeTipo2Instance) {
        if (unidadeTipo2Instance == null) {
            notFound()
            return
        }

        if (unidadeTipo2Instance.hasErrors()) {
            respond unidadeTipo2Instance.errors, view:'create'
            return
        }

        unidadeTipo2Instance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'unidadeTipo2Instance.label', default: 'UnidadeTipo2'), unidadeTipo2Instance.id])
                redirect unidadeTipo2Instance
            }
            '*' { respond unidadeTipo2Instance, [status: CREATED] }
        }
    }

    def edit(UnidadeTipo2 unidadeTipo2Instance) {
        respond unidadeTipo2Instance
    }

    @Transactional
    def update(UnidadeTipo2 unidadeTipo2Instance) {
        if (unidadeTipo2Instance == null) {
            notFound()
            return
        }

        if (unidadeTipo2Instance.hasErrors()) {
            respond unidadeTipo2Instance.errors, view:'edit'
            return
        }

        unidadeTipo2Instance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'UnidadeTipo2.label', default: 'UnidadeTipo2'), unidadeTipo2Instance.id])
                redirect unidadeTipo2Instance
            }
            '*'{ respond unidadeTipo2Instance, [status: OK] }
        }
    }

    @Transactional
    def delete(UnidadeTipo2 unidadeTipo2Instance) {

        if (unidadeTipo2Instance == null) {
            notFound()
            return
        }

        unidadeTipo2Instance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'UnidadeTipo2.label', default: 'UnidadeTipo2'), unidadeTipo2Instance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'unidadeTipo2Instance.label', default: 'UnidadeTipo2'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

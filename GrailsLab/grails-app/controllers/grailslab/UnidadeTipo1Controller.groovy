package grailslab



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UnidadeTipo1Controller {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond UnidadeTipo1.list(params), model:[unidadeTipo1InstanceCount: UnidadeTipo1.count()]
    }

    def show(UnidadeTipo1 unidadeTipo1Instance) {
        respond unidadeTipo1Instance
    }

    def create() {
        respond new UnidadeTipo1(params)
    }

    @Transactional
    def save(UnidadeTipo1 unidadeTipo1Instance) {
        if (unidadeTipo1Instance == null) {
            notFound()
            return
        }

        if (unidadeTipo1Instance.hasErrors()) {
            respond unidadeTipo1Instance.errors, view:'create'
            return
        }

        unidadeTipo1Instance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'unidadeTipo1Instance.label', default: 'UnidadeTipo1'), unidadeTipo1Instance.id])
                redirect unidadeTipo1Instance
            }
            '*' { respond unidadeTipo1Instance, [status: CREATED] }
        }
    }

    def edit(UnidadeTipo1 unidadeTipo1Instance) {
        respond unidadeTipo1Instance
    }

    @Transactional
    def update(UnidadeTipo1 unidadeTipo1Instance) {
        if (unidadeTipo1Instance == null) {
            notFound()
            return
        }

        if (unidadeTipo1Instance.hasErrors()) {
            respond unidadeTipo1Instance.errors, view:'edit'
            return
        }

        unidadeTipo1Instance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'UnidadeTipo1.label', default: 'UnidadeTipo1'), unidadeTipo1Instance.id])
                redirect unidadeTipo1Instance
            }
            '*'{ respond unidadeTipo1Instance, [status: OK] }
        }
    }

    @Transactional
    def delete(UnidadeTipo1 unidadeTipo1Instance) {

        if (unidadeTipo1Instance == null) {
            notFound()
            return
        }

        unidadeTipo1Instance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'UnidadeTipo1.label', default: 'UnidadeTipo1'), unidadeTipo1Instance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'unidadeTipo1Instance.label', default: 'UnidadeTipo1'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

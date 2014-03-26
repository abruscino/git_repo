package grailslab



import grails.test.mixin.*
import spock.lang.*

@TestFor(UnidadeTipo3Controller)
@Mock(UnidadeTipo3)
class UnidadeTipo3ControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.unidadeTipo3InstanceList
            model.unidadeTipo3InstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.unidadeTipo3Instance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            def unidadeTipo3 = new UnidadeTipo3()
            unidadeTipo3.validate()
            controller.save(unidadeTipo3)

        then:"The create view is rendered again with the correct model"
            model.unidadeTipo3Instance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            unidadeTipo3 = new UnidadeTipo3(params)

            controller.save(unidadeTipo3)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/unidadeTipo3/show/1'
            controller.flash.message != null
            UnidadeTipo3.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def unidadeTipo3 = new UnidadeTipo3(params)
            controller.show(unidadeTipo3)

        then:"A model is populated containing the domain instance"
            model.unidadeTipo3Instance == unidadeTipo3
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def unidadeTipo3 = new UnidadeTipo3(params)
            controller.edit(unidadeTipo3)

        then:"A model is populated containing the domain instance"
            model.unidadeTipo3Instance == unidadeTipo3
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/unidadeTipo3/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def unidadeTipo3 = new UnidadeTipo3()
            unidadeTipo3.validate()
            controller.update(unidadeTipo3)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.unidadeTipo3Instance == unidadeTipo3

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            unidadeTipo3 = new UnidadeTipo3(params).save(flush: true)
            controller.update(unidadeTipo3)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/unidadeTipo3/show/$unidadeTipo3.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/unidadeTipo3/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def unidadeTipo3 = new UnidadeTipo3(params).save(flush: true)

        then:"It exists"
            UnidadeTipo3.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(unidadeTipo3)

        then:"The instance is deleted"
            UnidadeTipo3.count() == 0
            response.redirectedUrl == '/unidadeTipo3/index'
            flash.message != null
    }
}

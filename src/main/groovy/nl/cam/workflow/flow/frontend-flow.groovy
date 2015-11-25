package nl.cam.workflow.flow

/**
 * Created by joost on 25-11-15.
 */


steps = load 'src/main/groovy/nl/cam/workflow/common/Steps.groovy'

// Execute the required steps
steps.npmBuild()
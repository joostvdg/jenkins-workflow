package nl.cam.workflow.flow

/**
 * Created by joost on 25-11-15.
 */

stage 'Load common flow scripts'
node {
    pwd()
    unstash 'flowFiles'
    pwd()
    sh 'ls -lath'
    load 'src/main/groovy/nl/cam/workflow/common/Steps.groovy'
}

// Execute the required steps
npmBuild()
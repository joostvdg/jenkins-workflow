package nl.cam.workflow.common

/**
 * Created by joost on 25-11-15.
 */


def npmBuild() {
    stage 'Build'
    node {
        sh 'ls -lath'
        unstash 'componentFiles'
        sh 'ls -lath'
        dir('component') {
            sh 'ls -lath'
            sh 'npm install'
        }
    }
}
return this;
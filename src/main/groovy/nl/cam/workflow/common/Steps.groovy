package nl.cam.workflow.common

/**
 * Created by joost on 25-11-15.
 */

def npmBuild = { ->
    stage 'Build'
    node {
        sh 'ls -lath'
        sh 'npm install'
    }
}
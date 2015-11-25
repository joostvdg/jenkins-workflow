package nl.cam.workflow

/**
 * Created by joost on 25-11-15.
 */

stage 'Build'
node {
    sh 'ls -lath'
    sh 'npm install'
}


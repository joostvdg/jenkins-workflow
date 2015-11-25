package nl.cam.workflow

/**
 * Created by joost on 25-11-15.
 */

stage 'Build'
node('npm') {
    sh 'npm install'
}


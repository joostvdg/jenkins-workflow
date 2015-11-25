package nl.cam.workflow.flow

/**
 * Created by joost on 25-11-15.
 */

import nl.cam.workflow.common.Steps

stage 'Load common flow scripts'
node {
    pwd()
    unstash 'flowFiles'
}

// Execute the required steps
Steps steps = new Steps()
steps.npmBuild()
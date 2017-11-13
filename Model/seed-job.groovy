def createSeedJob (moduleName) {
	stage '\u278B Create Seed Job'
}

def createDockerTemplate (moduleName) {
	stage '\u278C Create Pipeline Template'
}

def publish(moduleName) {
	stage '\u278D Publish to SCM'
}

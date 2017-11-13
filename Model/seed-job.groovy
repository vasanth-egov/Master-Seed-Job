def createSeedJob (moduleName) {
	stage '\u278B Create Seed Job'
	println moduleName
}

def createDockerTemplate (moduleName) {
	stage '\u278C Create Pipeline Template'
		println moduleName

}

def publish(moduleName) {
	stage '\u278D Publish to SCM'
		println moduleName

}

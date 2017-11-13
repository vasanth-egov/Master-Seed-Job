def createSeedJob (moduleName) {
	stage '\u278B Create Seed Job'
	println "${moduleName}"
	return "${moduleName}";
}

def createDockerTemplate (moduleName) {
	stage '\u278C Create Pipeline Template'
	println "${moduleName}"
	return "${moduleName}";
}

def publish(moduleName) {
	stage '\u278D Publish to SCM'
	println "${moduleName}"
	return "${moduleName}";
}


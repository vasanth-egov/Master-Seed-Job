def createSeedJob (moduleName) {
	stage ("Create Seed Job")
	{
			println "${moduleName}"
	}
}

def createDockerTemplate (moduleName) {
	stage ("Create Pipeline Template")
	{
		println "${moduleName}"
	}
}

def publish(moduleName) {
	stage ("Publish to SCM")
	{
		println "${moduleName}"
	}
}

return this;
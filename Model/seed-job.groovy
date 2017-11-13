def createSeedJob (moduleName) {
	stage ("Create Seed Job")
	{
			sh "echo ${moduleName}"
	}
}

def createDockerTemplate (moduleName) {
	stage ("Create Pipeline Template")
	{
		sh "echo  ${moduleName}"
	}
}

def publish(moduleName) {
	stage ("Publish to SCM")
	{
		sh "echo ${moduleName}"
	}
}

return this;
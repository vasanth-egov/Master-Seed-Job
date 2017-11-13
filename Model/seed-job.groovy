def createSeedJob(def moduleName){
	stage("Create-Seed-Job"){
			sh "echo ${moduleName}"
	}
}

def createDockerTemplate(def moduleName){
	stage("Create-Pipeline-Template"){
		sh "echo  ${moduleName}"
	}
}

def publish(def moduleName){
	stage("Publish-to-SCM"){
		sh "echo ${moduleName}"
	}
}

return this;

def createDockerTemplate(moduleName,serviceName,gitRepoUrl)
{
	stage("Create-Pipeline-Template")
	{
		sh "echo  ${moduleName}"
	}
}

def publishGithub(def moduleName)
{
	stage("Publish-to-SCM")
	{
		sh "echo ${moduleName}"
	}
}

def defaultServiceOverrides = { folder, jobName ->
    return {
      create = ["uri": "/jenkins/job/${folder}/createItem", params: [ name: "${jobName}" ] ]
      update = ["uri": "/jenkins/job/${folder}/job/${jobName}/config.xml"]
      get = ["uri": "/jenkins/job/${folder}/job/${jobName}/config.xml"]
      delete = ["uri": "/jenkins/job/${folder}/job/${jobName}/doDelete"]
    }
}
return this;
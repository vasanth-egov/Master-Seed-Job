def createSeedJob(moduleName,serviceName,gitRepoUrl)
{
	stage("Create-Seed-Job")
	{
		// Folder Create If not exists
		jenkins = Jenkins.instance
		def folder = jenkins.getItemByFullName(moduleName)
		if (folder == null) {
		  println "Creating Folder -- ${moduleName} ..!!"
		  def jenkinsInstance = Jenkins.getInstance()
		  folder = jenkinsInstance.createProject(Folder.class, moduleName)
		}
		// Job Create
		def scm = new GitSCM(gitRepoUrl)
		scm.branches = [new BranchSpec("*/master")];
		def flowDefinition = new org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition(scm, "Jenkinsfile")
		def parent = Jenkins.instance
		def job = new org.jenkinsci.plugins.workflow.job.WorkflowJob(parent, JOB_NAME)
		job.definition = flowDefinition
		parent.reload()
	}
}

def createDockerTemplate(def moduleName)
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
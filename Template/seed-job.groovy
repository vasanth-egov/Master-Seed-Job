package templates

class SeedJobTemplate 
{
    static void create(job, config) 
    {
        job.with 
        {
            description("Seed Job for ${config.repo} service.")
			logRotator 
			{
			     numToKeep(5)
			}
			concurrentBuild(false)
			triggers 
			{
			    scm 'H/10 * * * *'
			}

	        recipients = project.emails ?: defaultEmail
	        publishers 
	        {
	            extendedEmail 
	            {
	                recipientList(recipients)
	                triggers 
	                {
	                    failure 
	                    {
	                        sendTo 
	                        {
	                            recipientList()
	                        }
	                    }
	                    fixed 
	                    {
	                        sendTo 
	                        {
	                            recipientList()
	                        }
	                    }
	                }
	            }
	        }
	    }
	}
}
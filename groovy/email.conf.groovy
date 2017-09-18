import jenkins.model.*

def jenkinsLocationConfiguration = JenkinsLocationConfiguration.get()
// example format -> jenkinsLocationConfiguration.setAdminAddress("Jane Doe <foo@company_email.com>")

jenkinsLocationConfiguration.save()

def inst = Jenkins.getInstance()

def desc = inst.getDescriptor("hudson.tasks.Mailer")

//desc.setSmtpAuth("[SMTP user]", "[SMTP password]")
desc.setReplyToAddress("noreply.foo@company_email.com")
desc.setSmtpHost("smtp.foo.com")
desc.setUseSsl(false)
desc.setSmtpPort("25")
desc.setCharset("UTF-8")

desc.save()

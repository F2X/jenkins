import jenkins.model.*

def baseDir = new File("/jobs")
def files = baseDir.listFiles()

for (file in files){
	def configXml = file.getText('UTF-8')
	def jobName = org.apache.commons.io.FilenameUtils.getBaseName(file.name)
	def xmlStream = new ByteArrayInputStream( configXml.getBytes() )
	Jenkins.instance.createProjectFromXML(jobName, xmlStream)
}

import hudson.model.*

Hudson hudson = Hudson.getInstance()
hudson.setNumExecutors(1)
hudson.setNodes(hudson.getNodes())
hudson.save()

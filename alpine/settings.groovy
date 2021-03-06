/**
 * Jenkins 2.0 Buildfile
 **/

/**
 * Build parameters, must be adjusted when forked!
 **/
dockerImageName = 'blacklabelops/alpine'
dockerWorkspace = 'alpine/'
dockerTags = ["latest"] as String[]
dockerTestCommands =
 ["echo hello world",
  "ps -All",
  "uname -r",
  "whoami",
  "cat /etc/hosts",
  "cat /etc/passwd",
  "/sbin/tini -h",
  "su-exec"] as String[]
dockerRepositories = [["","Dockerhub","DockerhubEmail"]] as String[][]
dockerImages = ["alpine"] as String[]

return this;

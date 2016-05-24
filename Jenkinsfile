/** Jenkins 2.0 Buildfile
 *
 * Master Jenkins 2.0 can be started by typing:
 * docker run -d -p 8090:8080 --name jenkins blacklabelops/jenkins
 *
 * Slave 'docker' can be started by typing:
 * docker run -d -v /var/run/docker.sock:/var/run/docker.sock --link jenkins:jenkins -e "SWARM_CLIENT_LABELS=docker" blacklabelops/swarm-dockerhost
 **/
node {
  checkout scm
  stage 'Build & Test Images'
  parallel(
    "image-alpine": { load 'alpine/Jenkinsfile' },
    "image-centos": { load 'centos/Jenkinsfile' },
    "image-ubuntu": { load 'ubuntu/Jenkinsfile' }
  )
}

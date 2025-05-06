pipeline{
	agent any
	
	stages{
		stage('Build'){
			steps{
				sh 'mvn clean package'
			}
		}
		stage('deploiement dans tomcat'){
			steps{
				deploy adapters: [tomcat9(path: '', url: 'http://localhost:9090/')], contextPath: null, war: '**/*.war'
			}
		}
	}
}

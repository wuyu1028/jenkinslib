package org.devops

def Build(buildType,buildShell){
     def buildTools = ["mvn":"M2","ant":"ant","gradle":"gradle","npm":"npm"]
     
     println("当前要选择的构建类型 ${buildType}")
     buildHome = tool buildTools[buildType]
     if ("${buildType}" == "npm"){
          sh "export NODE_HOME=${buildHome} && export PATH=\$NODE_HOME/bin:\$PATH && ${buildHome}/bin/npm ${buildShell}"
     } else {
         sh "${buildHome}/bin/${buildType}  ${buildShell}"
     }

}

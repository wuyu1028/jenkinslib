package org.devops

def Build(buildType,buildShell){
     def buildTools = ["mvn":"M2","ant":"ant","gradle":"gradle","npm":"npm"]
     
     println("当前要选择的构建类型 ${buildType}")
     buildHome = tool buildTools[buildType]
     
     sh "${buildHome}/bin/${buildType}  ${buildShell}"

}

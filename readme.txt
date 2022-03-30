hello is a simple app that logs an env variable

apps are a bunch of deployment + service yamls


To build hello


brew install --cask graalvm/tap/graalvm-ce-java17
export GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.1.0-dev/Contents/Home
xattr -r -d com.apple.quarantine ${GRAALVM_HOME}/../..
$GRAALVM_HOME/bin/gu install native-image
export JAVA_HOME=${GRAALVM_HOME}
export PATH=${GRAALVM_HOME}/bin:$PATH

mvn package -Pnative -Dquarkus.native.container-build=true

docker build -f src/main/docker/Dockerfile.native -t burrsutter/hello:1.0.0 .

docker login

docker push burrsutter/hello:1.0.0
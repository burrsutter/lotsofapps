Notes on GraalVM Install:

brew install --cask graalvm/tap/graalvm-ce-lts-java11

export GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-lts-java11-20.3.4/Contents/Home

xattr -r -d com.apple.quarantine ${GRAALVM_HOME}/../..

${GRAALVM_HOME}/bin/gu install native-image

export JAVA_HOME=${GRAALVM_HOME}

export PATH=${GRAALVM_HOME}/bin:$PATH


Native Build in container

./mvnw package -Pnative -Dquarkus.native.container-build=true

docker build -f src/main/docker/Dockerfile.native -t burrsutter/hello .

docker push burrsutter/hello


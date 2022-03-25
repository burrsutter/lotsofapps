
helm template baseapp > accounting.yaml

helm apply -f accounting.yaml

change values.yaml to distribution

helm template baseapp > distribution.yaml

helm apply -f distribution.yaml

change values.yaml to finance

helm template baseapp > finance.yaml

helm apply -f finance.yaml



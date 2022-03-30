
helm template --set fullnameOverride=accounting baseapp > generated/accounting.yaml
kubectl apply -f generated/accounting.yaml

helm template --set fullnameOverride=distribution baseapp > generated/distribution.yaml
kubectl apply -f generated/distribution.yaml

helm template --set fullnameOverride=finance baseapp > generated/finance.yaml
kubectl apply -f generated/finance.yaml

helm template --set fullnameOverride=human-capital baseapp > generated/human-capital.yaml
kubectl apply -f generated/human-capital.yaml


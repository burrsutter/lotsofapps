
helm template --set fullnameOverride=accounting baseapp > generated/accounting.yaml
kubectl apply -f generated/accounting.yaml

helm template --set fullnameOverride=distribution baseapp > generated/distribution.yaml
kubectl apply -f generated/distribution.yaml

helm template --set fullnameOverride=finance baseapp > generated/finance.yaml
kubectl apply -f generated/finance.yaml

helm template --set fullnameOverride=human-capital baseapp > generated/human-capital.yaml
kubectl apply -f generated/human-capital.yaml

helm template --set fullnameOverride=logistics baseapp > generated/logistics.yaml
kubectl apply -f generated/logistics.yaml

helm template --set fullnameOverride=manufacturing baseapp > generated/manufacturing.yaml
kubectl apply -f generated/manufacturing.yaml

helm template --set fullnameOverride=mastercard-processor baseapp > generated/mastercard-processor.yaml
kubectl apply -f generated/mastercard-processor.yaml

helm template --set fullnameOverride=plant-maintenance baseapp > generated/plant-maintenance.yaml
kubectl apply -f generated/plant-maintenance.yaml

helm template --set fullnameOverride=production-planning baseapp > generated/production-planning.yaml
kubectl apply -f generated/production-planning.yaml

helm template --set fullnameOverride=quality-management baseapp > generated/quality-management.yaml
kubectl apply -f generated/quality-management.yaml

helm template --set fullnameOverride=sales --set selectorLabels=sales baseapp > generated/sales.yaml
kubectl apply -f generated/sales.yaml

helm template --set selectorLabelsOverride=visa-processor --set labelsOverrid=visa-processor --set fullnameOverride=visa-processor baseapp > generated/visa-processor.yaml
kubectl apply -f generated/visa-processor.yaml

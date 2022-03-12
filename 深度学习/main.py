import pandas as pd
from sklearn.datasets import load_iris

data = load_iris()
x = pd.DataFrame(data.data, columns=data.feature_names)
y = pd.DataFrame(data.target, columns=["Species"])
df = pd.concat([x, y], axis=1)
df.head()

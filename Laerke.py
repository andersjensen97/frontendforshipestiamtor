import numpy as np # linear algebra
import pandas as pd # data processing, CSV file I/O (e.g. pd.read_csv)
from pandas.core.frame import DataFrame
import matplotlib.pyplot as plt
from matplotlib.ticker import StrMethodFormatter
from sklearn.linear_model import LinearRegression # Linear regression
import seaborn as sns #grafic for matplotlib
import matplotlib.pyplot as plot
import statsmodels.formula.api as smf
from sklearn.model_selection import train_test_split
from sklearn import tree
from sklearn.tree import DecisionTreeRegressor
from sklearn.ensemble import RandomForestClassifier # for randomforrest
import datetime #for datetime mutations
from sklearn.pipeline import make_pipeline
from sklearn.preprocessing import StandardScaler
from sklearn.datasets import make_classification
from matplotlib.pyplot import figure
import pandas as pd
from sklearn.tree import DecisionTreeClassifier # Import Decision Tree Classifier
from sklearn.model_selection import train_test_split # Import train_test_split function
from sklearn import metrics #Import scikit-learn metrics module for accuracy calculation
from sklearn.datasets import load_diabetes
from sklearn.linear_model import RidgeCV


# read by default 1st sheet of an excel file
df=pd.read_excel('nyc_x.xlsx')
#print(df)

columns = ['incident_id', 'data_year', 'pug_agency_name', 'offender_race','offense_name', 'bias_desc']
df = df.loc[:, columns]
df.head(10)

features = ['incident_id', 'data_year', 'pug_agency_name', 'offender_race','offense_name']
X = df.loc[:, features]
y = df.loc[:, ['bias_desc']]

print(" \nCount total NaN at each column in a DataFrame : \n\n",
      df.isnull().sum())

print(" \nCount total NaN at each column in a DataFrame : \n\n",
      df.isnull().sum())

print(" \nCount total NaN at each column in a DataFrame : \n\n",
      df.isnull().sum())

X_train, X_test, y_train, y_test = train_test_split(X, y, random_state=0, train_size = .8)

X_train.dtypes

X_train["pug_agency_name_cat"]= X_train["pug_agency_name"].astype("category")
X_train["pug_agency_name_cat"].cat.codes
X_train["pug_agency_name_cat"]= X_train["pug_agency_name_cat"].cat.codes

X_train["offender_race_cat"]= X_train["offender_race"].astype("category")
X_train["offender_race_cat"].cat.codes
X_train["offender_race_cat"]= X_train["offender_race_cat"].cat.codes

X_train["offense_name_cat"]= X_train["offense_name"].astype("category")
X_train["offense_name_cat"].cat.codes
X_train["offense_name_cat"]= X_train["offense_name_cat"].cat.codes


X_train

X_test["pug_agency_name_cat"]= X_test["pug_agency_name"].astype("category")
X_test["pug_agency_name_cat"].cat.codes
X_test["pug_agency_name_cat"]= X_test["pug_agency_name_cat"].cat.codes

X_test["offender_race_cat"]= X_test["offender_race"].astype("category")
X_test["offender_race_cat"].cat.codes
X_test["offender_race_cat"]= X_test["offender_race_cat"].cat.codes

X_test["offense_name_cat"]= X_test["offense_name"].astype("category")
X_test["offense_name_cat"].cat.codes
X_test["offense_name_cat"]= X_test["offense_name_cat"].cat.codes

X_test

y_train["bias_desc_cat"]= y_train["bias_desc"].astype("category")
y_train["bias_desc_cat"].cat.codes
y_train["bias_desc_cat"]= y_train["bias_desc_cat"].cat.codes

y_test["bias_desc_cat"]= y_test["bias_desc"].astype("category")
y_test["bias_desc_cat"].cat.codes
y_test["bias_desc_cat"]= y_test["bias_desc_cat"].cat.codes

print(" \nCount total NaN at each column in a DataFrame : \n\n",
      X_test.isnull().sum())

X_test.dropna(subset=['pug_agency_name_cat'], inplace=True)


X_train["pug_agency_name_cat"] = pd.to_numeric(X_train["pug_agency_name_cat"])

X_test["pug_agency_name_cat"] = pd.to_numeric(X_train["pug_agency_name_cat"])

def bias_desc_comb(bias_desc):

    if bias_desc == 'Anti-Gay (Male)':
        return 'Anti-sexual orientation'

    elif bias_desc == 'Anti-Lesbian (Female)':
        return 'Anti-sexual orientation'

    elif bias_desc == 'Anti-Lesbian, Gay, Bisexual, or Transgender (Mixed Group)':
        return 'Anti-sexual orientation'

    elif bias_desc == 'Anti-Bisexual':
        return 'Anti-sexual orientation'

    elif bias_desc == 'Anti-Heterosexual':
        return 'Anti-sexual orientation'

    elif bias_desc == 'Anti-Transgender':
        return 'Anti-gender'

    elif bias_desc == 'Anti-Female':
        return 'Anti-gender'

    elif bias_desc == 'Anti-Gender Non-Conforming':
        return 'Anti-gender'

    elif bias_desc == 'Anti-Male':
        return 'Anti-gender'

    elif bias_desc == 'Anti-Black or African American':
        return 'Anti-race/ethnicity/ancestry'

    elif bias_desc == 'Anti-Arab':
        return 'Anti-race/ethnicity/ancestry'

    elif bias_desc == 'Anti-White':
        return 'Anti-race/ethnicity/ancestry'

    elif bias_desc == 'Anti-Hispanic or Latino':
        return 'Anti-race/ethnicity/ancestry'

    elif bias_desc == 'Anti-Asian':
        return 'Anti-race/ethnicity/ancestry'

    elif bias_desc == 'Anti-Multiple Races, Group':
        return 'Anti-race/ethnicity/ancestry'

    elif bias_desc == 'Anti-American Indian or Alaska Native':
        return 'Anti-race/ethnicity/ancestry'

    elif bias_desc == 'Anti-Other Race/Ethnicity/Ancestry':
        return 'Anti-race/ethnicity/ancestry'

    elif bias_desc == 'Anti-Other Religion':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Jewish':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Islamic (Muslim)':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Catholic':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Multiple Religions, Group':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Protestant':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Other Christian':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Hindu':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Sikh':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Eastern Orthodox (Russian, Greek, Other)':
        return 'Anti-religion'

    elif bias_desc == "Anti-Jehovah's Witness":
        return 'Anti-religion'

    elif bias_desc == 'Anti-Atheism/Agnosticism':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Buddhist':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Church of Jesus Christ':
        return 'Anti-religion'

    elif bias_desc == 'Anti-Physical Disability':
        return 'Anti-disability'

    elif bias_desc == 'Anti-Menatal disability':
        return 'Anti-disability'

    else:
        return 'MISSING'

y_train['bias_desc_comb'] = y_train['bias_desc'].apply(bias_desc_comb)

y_test['bias_desc_comb'] = y_test['bias_desc'].apply(bias_desc_comb)


y_train["bias_desc_comb_cat"]= y_train["bias_desc_comb"].astype("category")
y_train["bias_desc_comb_cat"].cat.codes
y_train["bias_desc_comb_cat"]= y_train["bias_desc_comb_cat"].cat.codes

y_test["bias_desc_comb_cat"]= y_test["bias_desc_comb"].astype("category")
y_test["bias_desc_comb_cat"].cat.codes
y_test["bias_desc_comb_cat"]= y_test["bias_desc_comb_cat"].cat.codes

y_train = y_train[y_train.bias_desc_comb != 'MISSING']
y_train = y_train[y_train.bias_desc_comb != 'Anti-gender']
y_train = y_train[y_train.bias_desc_comb != 'Anti-disability']


y_test = y_test[y_test.bias_desc_comb != 'MISSING']
y_test = y_test[y_test.bias_desc_comb != 'Anti-gender']
y_test = y_test[y_test.bias_desc_comb != 'Anti-disability']

y_train.drop(['bias_desc', 'bias_desc_cat'], axis=1, inplace=True)
y_test.drop(['bias_desc', 'bias_desc_cat'], axis=1, inplace=True)


y_train

from matplotlib import pyplot as plt
import seaborn as sns
y_train.groupby('bias_desc_comb').size().plot(kind='barh', color=sns.palettes.mpl_palette('Dark2'))
plt.gca().spines[['top', 'right',]].set_visible(False)

# Remove old object columns
X_train.drop(['pug_agency_name', 'offender_race','offense_name'], axis=1, inplace=True)

X_test.drop(['pug_agency_name', 'offender_race','offense_name'], axis=1, inplace=True)

y_train.drop(['bias_desc_comb'], axis=1, inplace=True)

y_test.drop(['bias_desc_comb'], axis=1, inplace=True)

X_train = X_train.iloc[:len(y_train), :]

X_test

# Instantiate and fit the classifier
model = RandomForestClassifier(n_estimators=100, max_depth=5, random_state=1)
model.fit(X_train, y_train)

# Get predictions
predictions = model.predict(X_test)

# Create a submission DataFrame
output = pd.DataFrame({'incident_id': X_test.incident_id, 'bias_desc_comb': predictions})

# Save the submission to a CSV file
output.to_csv('my_submission.csv', index=False)
print("success")

# Calculate and print the score (accuracy) on the training data
train_score = model.score(X_train, y_train)
print(f"Training Score (Accuracy): {train_score:.2f}")

# Create Decision Tree classifer object
clf = DecisionTreeClassifier()

# Train Decision Tree Classifer
clf = clf.fit(X_train,y_train)

#Predict the response for test dataset
y_pred = clf.predict(X_test)

# Model Accuracy, how often is the classifier correct?
print("Accuracy:",metrics.accuracy_score(y_test, y_pred))

plt.bar(range(X.shape[1]), model.feature_importances_)
plt.xlabel('Features')
plt.ylabel('Importance')
plt.show

X_test.dtypes

model = RidgeCV()

model.fit(X_train, y_train)

print(f"model score on training data: {model.score(X_train, y_train)}")
print(f"model score on testing data: {model.score(X_test, y_test)}")

X_train.std(axis=0).plot(kind="barh", figsize=(9, 7))
plt.title("Features std. dev.")
plt.subplots_adjust(left=0.3)
plt.xlim((0, 100))


model.fit(X_train, y_train)

print(f"model score on training data: {model.score(X_train, y_train)}")
print(f"model score on testing data: {model.score(X_test, y_test)}")

coefs = pd.DataFrame(
    model[1].coef_, columns=["Coefficients"], index=X_train.columns
)

coefs.plot(kind="barh", figsize=(9, 7))
plt.title("Ridge model")
plt.axvline(x=0, color=".5")
plt.subplots_adjust(left=0.3)

#df.columns

#df.dtypes

df.shape

ddf.shape

print(" \nCount total NaN at each column in a DataFrame : \n\n",
      ddf.isnull().sum())

ddf = ddf[(ddf['incident_date'] > '01-01-2000') & (df['incident_date'] <= '31-12-2022')]

# create a list of our conditions
conditions = [
    (ddf['data_year'] > 1990) & (df['data_year'] <= 1995),
    (ddf['data_year'] > 1995) & (df['data_year'] <= 2000),
    (ddf['data_year'] > 2000) & (df['data_year'] <= 2005),
    (ddf['data_year'] > 2005) & (df['data_year'] <= 2010),
    (ddf['data_year'] > 2010) & (df['data_year'] <= 2015),
    (ddf['data_year'] > 2015) & (df['data_year'] <= 2020),
    (ddf['data_year'] > 2020) & (df['data_year'] <= 2022),
    ]

# create a list of the values we want to assign for each condition
values = ['1991_1995', '1996_2000', '2001_2005', '2006_2010', '2011_2015', '2016_2020', '2021_2022']

# create a new column and use np.select to assign values to it using our lists as arguments
ddf['year_interval'] = np.select(conditions, values)

# display updated DataFrame
ddf.tail(10)

#print(ddf["data_year"].value_counts().sort_values(ascending=False))

#print(ddf["location_name"].value_counts().sort_values(ascending=False))

#print(ddf["offender_race"].value_counts(ascending=False))


#print(ddf["population_group_description"].value_counts(ascending=False))

#print(ddf[["bias_desc", "location_name"]].groupby("bias_desc").value_counts())

#print(ddf[["bias_desc", "year_interval"]].groupby("year_interval").value_counts().head(5000))



counts = ddf[["bias_desc", "year_interval"]].groupby("year_interval").value_counts()
counts.to_csv('countspo3.csv')

#m1 = smf.ols('data_year  ~  total_offender_count', data = dddf)
#r1 = m1.fit()

#print(r1.summary())

#m2 = smf.ols('data_year  ~  victim_count', data = dddf)
#r2 = m2.fit()

#print(r2.summary())

#ddf.plot.bar(x="population_group_description", title="population_group_description");

#plot.show();

def extract_1year(x):
    return x.split("-")[0].strip()

X_train["incident_date"] = pd.to_numeric(X_train["incident_date"])

X_test["incident_date"] = pd.to_numeric(X_test["incident_date"])

#Filling NaN for incident date with mean
X_train['incident_date'].fillna(int(X_train['incident_date'].mean()), inplace=True)

X_test['incident_date'].fillna(int(X_test['incident_date'].mean()), inplace=True)
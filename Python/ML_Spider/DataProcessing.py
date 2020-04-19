# -*- coding: utf-8 -*-
"""
Created on Mon Sep 16 17:34:17 2019

@author: 310204413  
"""  

import numpy as np 
import matplotlib.pyplot as plt
import pandas as pd

dataset = pd.read_csv('Data.csv')

X = dataset.iloc[:, :-1].values

y = dataset.iloc[:, 3].values
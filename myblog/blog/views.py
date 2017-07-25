from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.

'''
执行相应的代码所在模块
代码逻辑处理的主要地点
项目中大部分代码均在这里编写
'''

def index(request):
	return render(request, 'index.html', {'hello':'Hello Blog!'})
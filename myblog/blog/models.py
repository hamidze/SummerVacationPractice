from django.db import models

# Create your models here.

# 数据模块 使用ORM框架

class Article(models.Model):
	title = models.CharField(max_length=32, default='Title')
	content = models.TextField(null=True)
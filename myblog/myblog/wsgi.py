"""
WSGI config for myblog project.

It exposes the WSGI callable as a module-level variable named ``application``.

For more information on this file, see
https://docs.djangoproject.com/en/1.11/howto/deployment/wsgi/
"""

import os

from django.core.wsgi import get_wsgi_application

'''
WSGI(Python Web Server Gateway Interface)
Python服务器网关接口
Python应用与Web服务器之间的接口
'''


os.environ.setdefault("DJANGO_SETTINGS_MODULE", "myblog.settings")

application = get_wsgi_application()

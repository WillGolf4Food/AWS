#!/bin/bash

#
# Let's first update the instance with all security patches
#

yum update -y

#
# Now, let's get the http server installed and started
#

yum install httpd -y
service httpd start

#
# restart the httpd if the instance reboots
#

chkconfig httpd on

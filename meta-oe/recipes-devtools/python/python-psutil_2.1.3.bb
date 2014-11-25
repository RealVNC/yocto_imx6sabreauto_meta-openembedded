# This bitbake recipe is based on python-psutil_0.6.3.bb, which can be found on:
# 
#   fsl-community-bsp/sources/meta-openembedded/meta-oe/recipes-devtools/python/python-psutil_0.6.1.bb
#
# The original file had the following COPYING.MIT notice:
#
#   Permission is hereby granted, free of charge, to any person obtaining a copy 
#   of this software and associated documentation files (the "Software"), to deal 
#   in the Software without restriction, including without limitation the rights 
#   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
#   copies of the Software, and to permit persons to whom the Software is 
#   furnished to do so, subject to the following conditions:
#
#   The above copyright notice and this permission notice shall be included in 
#   all copies or substantial portions of the Software.
#
#   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
#   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
#   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
#   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
#   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
#   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN 
#   THE SOFTWARE.

SUMMARY = "A cross-platform process and system utilities module for Python"
SECTION = "devel/python"
HOMEPAGE = "https://github.com/giampaolo/psutil"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f02e99f7f3c9a7fe8ecfc5d44c2be62"

SRC_URI = "https://pypi.python.org/packages/source/p/psutil/psutil-${PV}.tar.gz"
SRC_URI[md5sum] = "015a013c46bb9bc30b5c344f26dea0d3"
SRC_URI[sha256sum] = "b434c75f01715777391f10f456002e33d0ca14633f96fdbd9ff9139b42d9452c"

S = "${WORKDIR}/psutil-${PV}"

inherit setuptools

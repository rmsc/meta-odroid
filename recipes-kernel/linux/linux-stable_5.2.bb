FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.2.14"
SRCREV ?= "997fee5473ce59c9b1461f54dd2975c57b258a6e"
SRCREV_meta ?= "158d4d069644044694e7869e3748875abda6eed7"

require linux-stable.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SUMMARY = "Wetek Enigma2 procfs drivers for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"
require conf/license/license-close.inc

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "wetekplay2|wetekhub"

KV = "3.14.29"
SRCDATE = "20161023"

PV = "${KV}+${SRCDATE}"

SRC_URI = "file://wetek-e2-procfs-${KV}-${SRCDATE}.zip"

S = "${WORKDIR}"

inherit module

do_compile() {
}

do_install() {
    install -d ${D}${base_libdir}/modules/${KV}/extra
    install -m 0755 ${WORKDIR}/e2-procfs.ko ${D}${base_libdir}/modules/${KV}/extra/
}

do_package_qa() {
}

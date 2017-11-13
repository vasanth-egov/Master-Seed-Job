def scmCheckout() {
	stage '\u278A SCM Checkout'
}

def createSeedJob () {
	stage '\u278B Create Seed Job'
}

def createDockerTemplate () {
	stage '\u278C Create Pipeline Template'
}

def publish() {
	stage '\u278D Publish to SCM'
}

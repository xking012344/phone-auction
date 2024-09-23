//foldable phones

class Phone(var isScreenLightOn: Boolean = false){
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isPhoneFolded: Boolean = false){
    var isScreenLightOn = true
    fun switchOn() {
        if (isPhoneFolded == true) {
            isScreenLightOn = false
        } else {
            isScreenLightOn = true
        }
    }

    fun changeFoldingState(){
        val phoneFolded = if (isPhoneFolded) "folded" else "unfolded"
        println("The phone's folded state is $phoneFolded")
    }
}
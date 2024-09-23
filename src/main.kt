//foldable phones

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
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

class FoldablePhone(var isPhoneFolded: Boolean = true): Phone() {
    override fun switchOn() {
        if (isPhoneFolded == false) {
            isScreenLightOn = true
        } else {
            isScreenLightOn = false
        }
    }

    fun fold() {
        isPhoneFolded = true
    }

    fun unfold() {
        isPhoneFolded = false
    }
}

    fun main(){
        val newFoldablePhone = FoldablePhone()

        newFoldablePhone.switchOn()
        newFoldablePhone.checkPhoneScreenLight()
        newFoldablePhone.unfold()
        newFoldablePhone.switchOn()
        newFoldablePhone.checkPhoneScreenLight()
    }
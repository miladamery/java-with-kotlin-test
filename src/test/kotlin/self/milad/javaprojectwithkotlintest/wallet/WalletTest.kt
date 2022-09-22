package self.milad.javaprojectwithkotlintest.wallet

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class WalletTest: BehaviorSpec({
    given("111") {
        `when`("222") {
            then("333") {
                Wallet().something() shouldBe 10
            }
        }
    }
})
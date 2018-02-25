import java.util.Currency

val currencies = Currency.getAvailableCurrencies
println(s"${currencies.size} currencies are available.")

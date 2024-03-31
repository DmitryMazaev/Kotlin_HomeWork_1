
/*Написать программу, которая обрабатывает введённые пользователем в консоль команды:
exit
help
add <Имя> phone <Номер телефона>
add <Имя> email <Адрес электронной почты>
После выполнения команды, кроме команды exit, программа ждёт следующую команду. */

fun main() {
    while (true) {
        print("Введите действие: 1. exit 2. help 3. add phone 4. add email: ")
        val a: String = enterInConsole()
        if (a == "exit") {
            println("Вы выбрали команду exit, до свидания!")
            break
        }
        if (a  == "help") {
            help()
        }
        if (a == "add phone") {
            addPhone()
        }
        if (a == "add email") {
            addEmail()
        }
    }
}

fun help() {
    println("Это функция help в домашнем задании к семинару 1")
    println("Чтобы выйти, введите в консоль exit \n" +
            "Чтобы получить помощь, введите в консоль help \n" +
            "Чтобы добавить нового пользователя и его номер телефона, введите в консоль add phone \n" +
            "Чтобы добавить нового пользователя и его лектронную почту, введите в консоль add email")
}

fun enterInConsole(): String {
    var enter: String = readLine().toString()
    return enter
}

fun addPhone() {
    print("Введите имя пользователя: ")
    var name: String? = readlnOrNull()
    print("Введите номер телефона: ")
    var number: String? = readlnOrNull()
    println("Имя: $name, номер телефона: $number")
}
fun addEmail() {
    print("Введите имя пользователя: ")
    var name: String? = readlnOrNull()
    print("Введите электронную почту: ")
    var email: String? = readlnOrNull()
    println("Имя: $name, электронная почта: $email")
}
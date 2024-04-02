
/*Написать программу, которая обрабатывает введённые пользователем в консоль команды:
exit
help
add <Имя> phone <Номер телефона>
add <Имя> email <Адрес электронной почты>
После выполнения команды, кроме команды exit, программа ждёт следующую команду. */

fun main() {
    while (true) {
        print("Введите действие: 1. exit 2. help 3. add <Имя> phone <Номер телефона> 4. add <Имя> email <Адрес электронной почты>: ")
        val a: String = enterInConsole()
        val del = " "
        val command = a.split(del)
        if (command[0] == "exit") {
            println("Вы выбрали команду exit, до свидания!")
            break
        }
        if (command[0]  == "help") {
            help()
        }
        if (command[0] == "add" && command[2] == "phone") {
            addPhone(command[1], command[3])
        }
        if (command[0] == "add" && command[2] == "email") {
            addEmail(command[1], command[3])
        }
    }
}

fun help() {
    println("Это функция help в домашнем задании к семинару 1")
    println("Чтобы выйти, введите в консоль exit \n" +
            "Чтобы получить помощь, введите в консоль help \n" +
            "Чтобы добавить нового пользователя и его номер телефона, введите в консоль add phone \n" +
            "Чтобы добавить нового пользователя и его электронную почту, введите в консоль add email")
}

fun enterInConsole(): String {
    var enter: String = readLine().toString()
    return enter
}

fun addPhone(name: String, phone: String) {
    println("Имя: $name, номер телефона: $phone")
}
fun addEmail(name: String, email: String) {
    println("Имя: $name, электронная почта: $email")
}

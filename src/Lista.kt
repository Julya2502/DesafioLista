import kotlin.system.exitProcess

fun main(){
    lista()
}

fun lista() {
    var lista = mutableMapOf<String, Int>()
    println("Lista de compras")
    println("$lista")
    var acao : String

    do {
        println("Selecione uma ação (1, 2, 3 ou 4)")
        println("1. Adiconar item")
        println("2. Remover item")
        println("3. Alterar preço")
        println("4. Sair")
        acao = readln()

        when (acao) {
            "1" -> {
                println("Digite o novo produto")
                val produto = readln()
                println("Digite o valor")
                val valor = readln().toInt()
                lista["$produto"] = valor

            }
            "2" -> {
                println("Digite o produto que deseja remover")
                var removerProduto = readln()
                if (lista.contains("$removerProduto")) {
                    println("Produto removido ${lista.remove(removerProduto)}")
                }

            }1
            "3" -> {
                println("Digite o produto que deseja alterar o valor")
                var produtoAlterar = readln()
                println("Digite o novo valor")
                var valorAlterar = readln().toInt()
                lista["$produtoAlterar"] = valorAlterar
            }
            else -> print("Lista finalizada")
        }

        println("$lista")

    } while (!acao.equals("4"))

}
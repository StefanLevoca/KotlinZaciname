package sk.jaroslavbeno.kotlin

fun main(args: Array<String>) {
    //C:\work\tools\__test

    val nieco2 = "fjdsfk sjfksjd\n fklsajf kldsj fkadj\n" +
            "fklsdaj fkl asdj \n" +
            "fasdôfk\n"
    val cesta = """C:\work    
                    |\tools\__test
                    |fdsjkfjfksdfjsd fsdjfsdfjsdf sdfk jfkf jsdkf
                    |jfklsdjf sdfj kfj sdkfjsd fksd jfsdfs df
                    |jfksdjfsdk fsjdf sdkfj sdkf jdkf dsfjsdf ksd 
                    |jf dsfkjsdkf sdfk sjdfsdj fksdf jsdkf 
                    |jfklds fjdksfj dkfj sdkf jsdkfjsd f
                    |jsd fksdjfkd fjdskfj sdkfj sklf sdôklf jsdk fsd
                    |jsf kjdsfjôs dfjds k fjdskf djsk fsdklf""".trimMargin()

    val nieco = """kfsdfksdlfkslfks fds kf
        |fsdfsfsfsfsfdfdsfsdf sd adsa;jf sdkf
        | jfkdlafj dkf jakf jak fjasdk jds a
        | jfkds ajfkdsa fjad fjasdfk jadskf ads
        | jfdska fjdasfj kda fjkldf ja jf a
        | fsdfasfsdaf asfjsdfkjdakfj dsaf 
    """.trimMargin()

    print(cesta)
}
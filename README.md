## sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).

### Debbug VSC

install Metals plugin, then add your project to metals, create this launch json file

{

    "version": "0.2.0",

    "configurations": [{

    "type": "scala",

    "request": "launch",

    // configuration name visible for the user

    "name": "Launch Main",

    // full name of the class to run

    "mainClass": "some.package",

    // optional arguments for the main class

    "args": ["Arg1", "Arg2"],

    // optional jvm properties to use

    "jvmOptions": []

    }]

}

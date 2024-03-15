console.log("Hello world");

// "tsc.filename.ts" to convert generate equivalent JS file
// "node filename.js" to run JS file

// -------------------------------------ONE-WAY DATA BINDING----------------------------------------
// {{}} => String Interpolation
//      => TS to HTML

// [] => property binding
//    => TS to HTML

// () => Event Binding 
//    => HTML to TS

// -------------------------------------TWO-WAY DATA BINDING----------------------------------------
// [()] =>  Binding 

// -------------------------------------ANGULAR PIPES----------------------------------------
// "Hello world" | uppercase

// app.module.ts :-
// -> declarations will contain all components' name
// -> imports will contain all dependencies

// -------------------------------------ANGULAR COMMANDS----------------------------------------
// ng new proj_name --no-standalone => for new project
// ng serve => run project
// ng g c component_name
// ng g d directive_name
// ng g s service_name

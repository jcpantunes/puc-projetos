#pragma checksum "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "26d8d773ae4865f895d2516f737e4a185732cb0f"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_CadFuncionario_Index), @"mvc.1.0.view", @"/Views/CadFuncionario/Index.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/CadFuncionario/Index.cshtml", typeof(AspNetCore.Views_CadFuncionario_Index))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#line 1 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/_ViewImports.cshtml"
using Puc.ProjetoFinal.SistemaUsuario;

#line default
#line hidden
#line 2 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/_ViewImports.cshtml"
using Puc.ProjetoFinal.SistemaUsuario.Models;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"26d8d773ae4865f895d2516f737e4a185732cb0f", @"/Views/CadFuncionario/Index.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"1f016fde058de82b470cb4ba22deaf16b7b67d7f", @"/Views/_ViewImports.cshtml")]
    public class Views_CadFuncionario_Index : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<IEnumerable<Puc.ProjetoFinal.SistemaUsuario.Models.FuncionarioModel>>
    {
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_0 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("src", new global::Microsoft.AspNetCore.Html.HtmlString("~/lib/jquery/dist/jquery.js"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_1 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("src", new global::Microsoft.AspNetCore.Html.HtmlString("~/lib/jquery-ui/jquery-ui.js"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_2 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("asp-action", "Incluir", global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        private static readonly global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute __tagHelperAttribute_3 = new global::Microsoft.AspNetCore.Razor.TagHelpers.TagHelperAttribute("class", new global::Microsoft.AspNetCore.Html.HtmlString("btn"), global::Microsoft.AspNetCore.Razor.TagHelpers.HtmlAttributeValueStyle.DoubleQuotes);
        #line hidden
        #pragma warning disable 0169
        private string __tagHelperStringValueBuffer;
        #pragma warning restore 0169
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperExecutionContext __tagHelperExecutionContext;
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner __tagHelperRunner = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner();
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __backed__tagHelperScopeManager = null;
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __tagHelperScopeManager
        {
            get
            {
                if (__backed__tagHelperScopeManager == null)
                {
                    __backed__tagHelperScopeManager = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager(StartTagHelperWritingScope, EndTagHelperWritingScope);
                }
                return __backed__tagHelperScopeManager;
            }
        }
        private global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.UrlResolutionTagHelper __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper;
        private global::Microsoft.AspNetCore.Mvc.TagHelpers.AnchorTagHelper __Microsoft_AspNetCore_Mvc_TagHelpers_AnchorTagHelper;
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(76, 1, true);
            WriteLiteral("\n");
            EndContext();
#line 3 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
  
    ViewData["Title"] = "Cadastrar Funcionario";
    Layout = "~/Views/Shared/_Layout.2.cshtml";

#line default
#line hidden
            BeginContext(179, 1, true);
            WriteLiteral("\n");
            EndContext();
            DefineSection("scripts", async() => {
                BeginContext(198, 5, true);
                WriteLiteral("\n    ");
                EndContext();
                BeginContext(203, 51, false);
                __tagHelperExecutionContext = __tagHelperScopeManager.Begin("script", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "741e609dbc1949068b7a3c4c368e9544", async() => {
                }
                );
                __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.UrlResolutionTagHelper>();
                __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper);
                __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_0);
                await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
                if (!__tagHelperExecutionContext.Output.IsContentModified)
                {
                    await __tagHelperExecutionContext.SetOutputContentAsync();
                }
                Write(__tagHelperExecutionContext.Output);
                __tagHelperExecutionContext = __tagHelperScopeManager.End();
                EndContext();
                BeginContext(254, 5, true);
                WriteLiteral("\n    ");
                EndContext();
                BeginContext(259, 52, false);
                __tagHelperExecutionContext = __tagHelperScopeManager.Begin("script", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "dbef62d7ea94467d9173533285c22124", async() => {
                }
                );
                __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.UrlResolutionTagHelper>();
                __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_Razor_TagHelpers_UrlResolutionTagHelper);
                __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_1);
                await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
                if (!__tagHelperExecutionContext.Output.IsContentModified)
                {
                    await __tagHelperExecutionContext.SetOutputContentAsync();
                }
                Write(__tagHelperExecutionContext.Output);
                __tagHelperExecutionContext = __tagHelperScopeManager.End();
                EndContext();
                BeginContext(311, 797, true);
                WriteLiteral(@"
    <script>
        $(function() {
            $('a[id*=btnRemover]').click(function (e) {
                debugger;
                e.preventDefault();
                var href = $(this).attr('href');
                $('#confirmDialog').data('id', href).dialog('open');
            });

            $(""#confirmDialog"").dialog({
                autoOpen: false,
                modal: true,
                resizable: false,
                buttons: {
                    ""Ok"": function () {
                        var id = $(this).data(""id"");
                        window.location.href = id;
                    },
                    ""Cancel"": function (e) {
                        $(this).dialog(""close"");
                    }
                }
            });
        });
    </script>
");
                EndContext();
            }
            );
            BeginContext(1110, 4697, true);
            WriteLiteral(@"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            WriteLiteral(@"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            WriteLiteral(@"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            WriteLiteral(@"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            WriteLiteral(@"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    <div class=""div-right"">
        ");
            EndContext();
            BeginContext(5807, 47, false);
            __tagHelperExecutionContext = __tagHelperScopeManager.Begin("a", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "f7a376fa8dd24d4cba5748de80da37af", async() => {
                BeginContext(5843, 7, true);
                WriteLiteral("Incluir");
                EndContext();
            }
            );
            __Microsoft_AspNetCore_Mvc_TagHelpers_AnchorTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.TagHelpers.AnchorTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_TagHelpers_AnchorTagHelper);
            __Microsoft_AspNetCore_Mvc_TagHelpers_AnchorTagHelper.Action = (string)__tagHelperAttribute_2.Value;
            __tagHelperExecutionContext.AddTagHelperAttribute(__tagHelperAttribute_2);
            __tagHelperExecutionContext.AddHtmlAttribute(__tagHelperAttribute_3);
            await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
            if (!__tagHelperExecutionContext.Output.IsContentModified)
            {
                await __tagHelperExecutionContext.SetOutputContentAsync();
            }
            Write(__tagHelperExecutionContext.Output);
            __tagHelperExecutionContext = __tagHelperScopeManager.End();
            EndContext();
            BeginContext(5854, 176, true);
            WriteLiteral("\n    </div>\n\n    <div class=\"well\">\n        <table class=\"table dataTable no-footer\">\n            <thead>\n                <tr>\n                    <th>\n                        ");
            EndContext();
            BeginContext(6031, 49, false);
#line 47 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
                   Write(Html.DisplayNameFor(model => model.IdFuncionario));

#line default
#line hidden
            EndContext();
            BeginContext(6080, 76, true);
            WriteLiteral("\n                    </th>\n                    <th>\n                        ");
            EndContext();
            BeginContext(6157, 40, false);
#line 50 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
                   Write(Html.DisplayNameFor(model => model.Nome));

#line default
#line hidden
            EndContext();
            BeginContext(6197, 76, true);
            WriteLiteral("\n                    </th>\n                    <th>\n                        ");
            EndContext();
            BeginContext(6274, 45, false);
#line 53 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
                   Write(Html.DisplayNameFor(model => model.Matricula));

#line default
#line hidden
            EndContext();
            BeginContext(6319, 120, true);
            WriteLiteral("\n                    </th>\n                    <th></th>\n                </tr>\n            </thead>\n            <tbody>\n");
            EndContext();
#line 59 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
             foreach (var item in Model) {

#line default
#line hidden
            BeginContext(6482, 70, true);
            WriteLiteral("                <tr>\n                    <td>\n                        ");
            EndContext();
            BeginContext(6553, 48, false);
#line 62 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
                   Write(Html.DisplayFor(modelItem => item.IdFuncionario));

#line default
#line hidden
            EndContext();
            BeginContext(6601, 76, true);
            WriteLiteral("\n                    </td>\n                    <td>\n                        ");
            EndContext();
            BeginContext(6678, 39, false);
#line 65 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
                   Write(Html.DisplayFor(modelItem => item.Nome));

#line default
#line hidden
            EndContext();
            BeginContext(6717, 76, true);
            WriteLiteral("\n                    </td>\n                    <td>\n                        ");
            EndContext();
            BeginContext(6794, 44, false);
#line 68 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
                   Write(Html.DisplayFor(modelItem => item.Matricula));

#line default
#line hidden
            EndContext();
            BeginContext(6838, 76, true);
            WriteLiteral("\n                    </td>\n                    <td>\n                        ");
            EndContext();
            BeginContext(6915, 91, false);
#line 71 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
                   Write(Html.ActionLink("Editar", "Editar", new { id=item.IdFuncionario }, new { @id="btnEditar" }));

#line default
#line hidden
            EndContext();
            BeginContext(7006, 27, true);
            WriteLiteral(" |\n                        ");
            EndContext();
            BeginContext(7034, 94, false);
#line 72 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
                   Write(Html.ActionLink("Remover", "Remover", new { id=item.IdFuncionario }, new { @id="btnRemover" }));

#line default
#line hidden
            EndContext();
            BeginContext(7128, 49, true);
            WriteLiteral("\n                    </td>\n                </tr>\n");
            EndContext();
#line 75 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.SistemaUsuario/Views/CadFuncionario/Index.cshtml"
        }

#line default
#line hidden
            BeginContext(7187, 182, true);
            WriteLiteral("            </tbody>\n        </table>\n    </div>\n\n    <div id=\"confirmDialog\" title=\"Remover Funcionario\" hidden>\n        <p>Você confirmar a exclusão do Funcionario?</p>\n    </div>\n");
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<IEnumerable<Puc.ProjetoFinal.SistemaUsuario.Models.FuncionarioModel>> Html { get; private set; }
    }
}
#pragma warning restore 1591

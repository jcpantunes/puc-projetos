#pragma checksum "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "930521455b0e350302b34ddf3711e21e2e8737bb"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Log_Detalhe), @"mvc.1.0.view", @"/Views/Log/Detalhe.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Log/Detalhe.cshtml", typeof(AspNetCore.Views_Log_Detalhe))]
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
#line 1 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/_ViewImports.cshtml"
using Puc.ProjetoFinal.ConsultaLog;

#line default
#line hidden
#line 2 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/_ViewImports.cshtml"
using Puc.ProjetoFinal.ConsultaLog.Models;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"930521455b0e350302b34ddf3711e21e2e8737bb", @"/Views/Log/Detalhe.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"85b0dd7955891a0af1e037c77c635e19278818ec", @"/Views/_ViewImports.cshtml")]
    public class Views_Log_Detalhe : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<Puc.ProjetoFinal.ConsultaLog.Models.LogModel>
    {
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
            BeginContext(52, 1, true);
            WriteLiteral("\n");
            EndContext();
#line 3 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
  
    Layout = "~/Views/Shared/_Layout.1.cshtml";

#line default
#line hidden
            BeginContext(106, 362, true);
            WriteLiteral(@" 
<div class=""modal-dialog"">
    <div class=""modal-content"">
        <div class=""modal-header"">
            <button type=""button"" class=""close"" data-dismiss=""modal""><span aria-hidden=""true"">×</span><span class=""sr-only"">Close</span></button>
            <h4 class=""modal-title"">Detalhe</h4>
        </div>
        <div class=""modal-body"">
            <p><strong>");
            EndContext();
            BeginContext(469, 58, false);
#line 14 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                  Write(Html.DisplayNameFor(model => model.Informacao.NomeSistema));

#line default
#line hidden
            EndContext();
            BeginContext(527, 11, true);
            WriteLiteral(":</strong> ");
            EndContext();
            BeginContext(539, 54, false);
#line 14 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                                                                                        Write(Html.DisplayFor(model => model.Informacao.NomeSistema));

#line default
#line hidden
            EndContext();
            BeginContext(593, 28, true);
            WriteLiteral("</p>\n            <p><strong>");
            EndContext();
            BeginContext(622, 61, false);
#line 15 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                  Write(Html.DisplayNameFor(model => model.Informacao.TipoInformacao));

#line default
#line hidden
            EndContext();
            BeginContext(683, 11, true);
            WriteLiteral(":</strong> ");
            EndContext();
            BeginContext(695, 57, false);
#line 15 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                                                                                           Write(Html.DisplayFor(model => model.Informacao.TipoInformacao));

#line default
#line hidden
            EndContext();
            BeginContext(752, 28, true);
            WriteLiteral("</p>\n            <p><strong>");
            EndContext();
            BeginContext(781, 53, false);
#line 16 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                  Write(Html.DisplayNameFor(model => model.Informacao.Ticket));

#line default
#line hidden
            EndContext();
            BeginContext(834, 11, true);
            WriteLiteral(":</strong> ");
            EndContext();
            BeginContext(846, 49, false);
#line 16 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                                                                                   Write(Html.DisplayFor(model => model.Informacao.Ticket));

#line default
#line hidden
            EndContext();
            BeginContext(895, 28, true);
            WriteLiteral("</p>\n            <p><strong>");
            EndContext();
            BeginContext(924, 51, false);
#line 17 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                  Write(Html.DisplayNameFor(model => model.Informacao.Hash));

#line default
#line hidden
            EndContext();
            BeginContext(975, 11, true);
            WriteLiteral(":</strong> ");
            EndContext();
            BeginContext(987, 47, false);
#line 17 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                                                                                 Write(Html.DisplayFor(model => model.Informacao.Hash));

#line default
#line hidden
            EndContext();
            BeginContext(1034, 28, true);
            WriteLiteral("</p>\n            <p><strong>");
            EndContext();
            BeginContext(1063, 60, false);
#line 18 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                  Write(Html.DisplayNameFor(model => model.Informacao.DataFormatada));

#line default
#line hidden
            EndContext();
            BeginContext(1123, 11, true);
            WriteLiteral(":</strong> ");
            EndContext();
            BeginContext(1135, 56, false);
#line 18 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                                                                                          Write(Html.DisplayFor(model => model.Informacao.DataFormatada));

#line default
#line hidden
            EndContext();
            BeginContext(1191, 28, true);
            WriteLiteral("</p>\n            <p><strong>");
            EndContext();
            BeginContext(1220, 56, false);
#line 19 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                  Write(Html.DisplayNameFor(model => model.Informacao.Descricao));

#line default
#line hidden
            EndContext();
            BeginContext(1276, 16, true);
            WriteLiteral(":</strong><br/> ");
            EndContext();
            BeginContext(1293, 52, false);
#line 19 "/home/julio/Documentos/workspace-github/puc-projetos/novopf/Puc.ProjetoFinal/Puc.ProjetoFinal.ConsultaInformacao/Views/Log/Detalhe.cshtml"
                                                                                           Write(Html.DisplayFor(model => model.Informacao.Descricao));

#line default
#line hidden
            EndContext();
            BeginContext(1345, 182, true);
            WriteLiteral("</p>\n        </div>\n        <div class=\"modal-footer\">\n            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Fechar</button>\n        </div>\n    </div>\n</div>");
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
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<Puc.ProjetoFinal.ConsultaLog.Models.LogModel> Html { get; private set; }
    }
}
#pragma warning restore 1591
